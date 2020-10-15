package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_x_0_y_1_dir_N_when_given_x_0_y_0_dir_N_move_M() {
        //given
        marsRover marsRover = new marsRover(0,0,'N');
        //when
        marsRover.executeMovement("M");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(1, marsRover.coordinateY());
        assertEquals('N', marsRover.getDirection());
    }
}
