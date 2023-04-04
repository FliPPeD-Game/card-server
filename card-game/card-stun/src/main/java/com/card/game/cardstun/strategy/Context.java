package com.card.game.cardstun.strategy;

import com.card.game.cardstun.model.ConnectionEntity;
import com.card.game.cardstun.model.Message;
import lombok.RequiredArgsConstructor;

/**
 * 上下文
 *
 * @author cunzhiwang
 * @Date 2023/4/4 11:46
 */
@RequiredArgsConstructor
public class Context {
    private final OperateStrategy operateStrategy;

  public   void operate(Message message, ConnectionEntity connection) {
        operateStrategy.operate(message, connection);
    }
}
