package co.q64.arcade.core.api.reward;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public enum RewardStatus {
	CAN_CLAIM, USED_ONCE, NEED_RANK, UNLOCK_IN
}