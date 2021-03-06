package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DemoTest {

    @Test
    void should_throw_CommandNotDefinedException_when_given_x_0_y_0_dir_N_move_F() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        //then
        assertThrows(CommandNotDefinedException.class, () -> commandReceiver.executeCommands("F"));
    }

    @Test
    void should_return_x_0_y_1_dir_N_when_given_x_0_y_0_dir_N_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("M");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(1, marsRover.getCoordinateY());
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_W_when_given_x_0_y_0_dir_N_move_L() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("L");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('W', marsRover.getDirection());

    }

    @Test
    void should_return_x_0_y_0_dir_E_when_given_x_0_y_0_dir_N_move_R() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("R");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_negative_1_dir_S_when_given_x_0_y_0_dir_S_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'S');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("M");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(-1, marsRover.getCoordinateY());
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_E_when_given_x_0_y_0_dir_S_move_L() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'S');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("L");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_W_when_given_x_0_y_0_dir_S_move_R() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'S');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("R");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void should_return_x_1_y_0_dir_E_when_given_x_0_y_0_dir_E_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'E');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("M");
        //then
        assertEquals(1, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_N_when_given_x_0_y_0_dir_E_move_L() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'E');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("L");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_S_when_given_x_0_y_0_dir_E_move_R() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'E');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("R");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void should_return_x_negative_1_y_0_dir_W_when_given_x_0_y_0_dir_W_move_M() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'W');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("M");
        //then
        assertEquals(-1, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_S_when_given_x_0_y_0_dir_W_move_L() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'W');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("L");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_dir_N_when_given_x_0_y_0_dir_W_move_R() {
        //given
        marsRover marsRover = new marsRover(0, 0, 'W');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("R");
        //then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    void should_return_x_negative_1_y_1_dir_N_when_given_x_0_y_0_dir_N_move_MLMR() throws CommandNotDefinedException {
        //given
        marsRover marsRover = new marsRover(0, 0, 'N');
        //when
        CommandReceiver commandReceiver = new CommandReceiver(marsRover);
        commandReceiver.executeCommands("MLMR");
        //then
        assertEquals(-1, marsRover.getCoordinateX());
        assertEquals(1, marsRover.getCoordinateY());
        assertEquals('N', marsRover.getDirection());
    }

}