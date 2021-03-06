package cn.laoshini.game.example.tank.message.gm;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import cn.laoshini.game.example.tank.annotation.TankMessage;
import cn.laoshini.game.example.tank.constant.TankConstants;

/**
 * @author fagarine
 */
@Getter
@Setter
@ToString
@TankMessage(id = GetPlayersReq.MESSAGE_ID, gm = true)
public class GetPlayersReq {

    public static final int MESSAGE_ID = TankConstants.GM_HEAD + TankConstants.GET_PLAYERS_REQ;
}
