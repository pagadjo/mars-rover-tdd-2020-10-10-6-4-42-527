package com.afs.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DemoTest {

    @Test
    void should_return_CommandNotDefinedException_when_given_x_0_y_0_dir_N_move_F() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        //then
        assertThrows(CommandNotDefinedException.class, () -> marsRover.validateCommand("A"));
    }

    @Test
    void should_return_x_0_y_1_dir_N_when_given_x_0_y_0_dir_N_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        marsRover.execCommand("M");
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
        marsRover.execCommand("L");
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
        marsRover.execCommand("R");
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
        marsRover.execCommand("M");
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
        marsRover.execCommand("L");
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
        marsRover.execCommand("R");
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
        marsRover.execCommand("M");
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
        marsRover.execCommand("L");
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
        marsRover.execCommand("R");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void should_return_x_negative_1_y_0_dir_W_when_given_x_0_y_0_dir_W_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'W');
        //when
        marsRover.execCommand("M");
        //then
        assertEquals(-1, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_S_when_given_x_0_y_0_dir_W_move_L() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'W');
        //when
        marsRover.execCommand("L");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_N_when_given_x_0_y_0_dir_W_move_R() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'W');
        //when
        marsRover.execCommand("R");
        //then
        assertEquals(0, marsRover.coordinateX());
        assertEquals(0, marsRover.coordinateY());
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    void should_return_x_negative_1_y_1_dir_N_when_given_x_0_y_0_dir_N_move_MLMR() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        marsRover.execCommandsMany("MLMR");
        //then
        assertEquals(-1, marsRover.coordinateX());
        assertEquals(1, marsRover.coordinateY());
        assertEquals('N', marsRover.getDirection());
    }

}