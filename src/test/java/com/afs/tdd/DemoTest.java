package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_x_0_y_1_dir_N_when_given_x_0_y_0_dir_N_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        marsRover.executeMovement("M");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(1, marsRover.coordinateY());
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_W_when_given_x_0_y_0_dir_N_move_L() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        marsRover.executeMovement("L");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_E_when_given_x_0_y_0_dir_N_move_R() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        marsRover.executeMovement("R");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_negative_1_dir_S_when_given_x_0_y_0_dir_S_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'S');
        //when
        marsRover.executeMovement("M");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(-1, marsRover.coordinateY());
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_E_when_given_x_0_y_0_dir_S_move_L() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'S');
        //when
        marsRover.executeMovement("L");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_W_when_given_x_0_y_0_dir_S_move_R() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'S');
        //when
        marsRover.executeMovement("R");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void should_return_x_1_y_0_dir_E_when_given_x_0_y_0_dir_E_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'E');
        //when
        marsRover.executeMovement("M");
        //then
        assertEquals(1, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_N_when_given_x_0_y_0_dir_E_move_L() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'E');
        //when
        marsRover.executeMovement("L");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_S_when_given_x_0_y_0_dir_E_move_R() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'E');
        //when
        marsRover.executeMovement("R");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('S', marsRover.getDirection());
    }
}