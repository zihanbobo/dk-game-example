package cn.laoshini.game.example.chat.message;

import cn.laoshini.game.example.chat.constant.ChatConstants;

/**
 * @author fagarine
 */
public class ChatLoginRes {

    /** 使用常量记录id，可通过{@link cn.laoshini.dk.register.ClassIdReader#fieldReader(String)}创建一个id读取器对象读取类的id */
    public static final int MESSAGE_ID = ChatConstants.GAME_ID * 1000 + ChatConstants.LOGIN_REQ_ID + 1;

    /** 使用静态方法返回id，可通过{@link cn.laoshini.dk.register.ClassIdReader#methodReader(String)}创建一个id读取器对象读取类的id */
    public static int getId() {
        return MESSAGE_ID;
    }

    @Override
    public String toString() {
        return "ChatLoginRes{}";
    }
}
