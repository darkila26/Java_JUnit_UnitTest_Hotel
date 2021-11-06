package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    void TestNewRoom(){
        // E - Entrada de massa de dados
        int RoomNumber = 200;
        String RoomName = "Suite Luxo";
        double DailyPrice = 500;

        // T - Executar o teste
        Room quartoluxo = new Room(RoomNumber, RoomName, DailyPrice);

        // R - Validar os resultados
        assertEquals(RoomNumber, quartoluxo.getId());
        assertEquals(RoomName, quartoluxo.getName());
        assertEquals(DailyPrice, quartoluxo.getPricePerDay());


    }

    
}
