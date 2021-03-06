package by.it.baidak.project.java.controller;

enum Action {

    INDEX(new CmdIndex()),
    LOGIN(new CmdLogin()),
    LOGOUT(new CmdLogout()),
    SIGNUP(new CmdSignup()),
    ERROR(new CmdError());

    Cmd cmd;

    Action(Cmd cmdIndex) {
        cmd = cmdIndex;
    }

    String getJsp() {
        return "/" + cmd.toString() + ".jsp";
    }
}
