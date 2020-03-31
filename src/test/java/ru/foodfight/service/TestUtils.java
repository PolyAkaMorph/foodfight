package ru.foodfight.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.foodfight.dto.MealDTO;
import ru.foodfight.dto.MenuDTO;
import ru.foodfight.model.User;
import ru.foodfight.model.Vote;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class TestUtils {
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final Integer START_SEQ = 10000;

    public static User user1 = new User(START_SEQ, 0, "John","password");
    public static User user2 = new User(START_SEQ + 1, 0, "Sara","password");

    public static Vote vote1 = new Vote(START_SEQ + 4, user1, null, LocalDateTime.parse("2020-03-22 10:00:00", formatter));
    public static Vote vote2 = new Vote(START_SEQ + 5, user2, null, LocalDateTime.parse("2020-03-22 10:30:00", formatter));

    public static String jsonString = "[ {\n" +
            "  \"restaurant\" : {\n" +
            "    \"name\" : \"El Paso\"\n" +
            "  },\n" +
            "  \"mealList\" : [ {\n" +
            "    \"name\" : \"Chips & Salsa\",\n" +
            "    \"price\" : 180.0\n" +
            "  }, {\n" +
            "    \"name\" : \"Spicy Pork\",\n" +
            "    \"price\" : 170.0\n" +
            "  } ]\n" +
            "}, {\n" +
            "  \"restaurant\" : {\n" +
            "    \"name\" : \"McDack\"\n" +
            "  },\n" +
            "  \"mealList\" : [ {\n" +
            "    \"name\" : \"Pasta Carbonara\",\n" +
            "    \"price\" : 150.0\n" +
            "  }, {\n" +
            "    \"name\" : \"Chicken Pot Pie\",\n" +
            "    \"price\" : 190.0\n" +
            "  } ]\n" +
            "} ]";
    public static boolean compare(User user1, User user2) {
        try {
            return user1.getId().equals(user2.getId()) &&
                    user1.getName().equals(user2.getName()) &&
                    user1.getIsAdmin().equals(user2.getIsAdmin());
        } catch (NullPointerException e) {
            return false;
        }
    }

    //compares user_id, not user
    public static boolean compare(Vote vote1, Vote vote2) {
        try {
            return vote1.getId().equals(vote2.getId()) &&
                    vote1.getVoteTime().equals(vote2.getVoteTime());
        } catch (NullPointerException e) {
            return false;
        }
    }


    public static void main(String[] args) throws JsonProcessingException {
        MealDTO mealDTO = new MealDTO("dishname",123);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonstring = objectMapper.writeValueAsString(mealDTO);
        System.out.println(jsonstring);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mealDTO));

        MenuDTO[] menuDTO = objectMapper.readValue(jsonString, MenuDTO[].class);
        System.out.println(menuDTO.length);

        List<MealDTO> mealListElPaso = List.of(new MealDTO("Chips & Salsa",180), new MealDTO("Spicy Pork",170));
        MenuDTO menuDTOElPaso = new MenuDTO("El Paso", mealListElPaso);
        List<MealDTO> mealListMcDack = List.of(new MealDTO("Pasta Carbonara",150), new MealDTO("Chicken Pot Pie",190));
        MenuDTO menuDTOMcDack = new MenuDTO("McDack", mealListMcDack);
        MenuDTO[] newMenuDTO = {menuDTOElPaso,menuDTOMcDack};
        String jsonMenuDTO = objectMapper.writeValueAsString(newMenuDTO);
        String formattedJsonMenuDTO = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newMenuDTO);
        System.out.println(jsonMenuDTO);
        System.out.println(formattedJsonMenuDTO);

        for (int i = 0; i < newMenuDTO.length; i++) {

            if (newMenuDTO[i].equals(menuDTO[i])) {
                System.out.println(true);
            }
        }

    }
}
