package data.dummy;

public class Customer_rewardsData implements data.Customer_rewardsData {
    @Override
    public String getCustomer_rewards(int customer_rewardsId) {

        return "{\"customerId\":104,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"}";
    }

    @Override
    public String getAllCustomer_rewards() {

        return "[{\"customerId\":104,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"},{\"customerId\":104,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"},{\"customerId\":105,\"rewardId\":2,\"rwdNumber\":\"1435 678 CA\"},{\"customerId\":106,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"},{\"customerId\":106,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"},{\"customerId\":107,\"rewardId\":2,\"rwdNumber\":\"5735 638 CF\"},{\"customerId\":107,\"rewardId\":2,\"rwdNumber\":\"5735 638 CF\"},{\"customerId\":108,\"rewardId\":1,\"rwdNumber\":\"129456 4322\"},{\"customerId\":109,\"rewardId\":4,\"rwdNumber\":\"4343 23 5435\"},{\"customerId\":109,\"rewardId\":4,\"rwdNumber\":\"4343 23 5435\"},{\"customerId\":114,\"rewardId\":2,\"rwdNumber\":\"5875 678 CG\"},{\"customerId\":117,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"},{\"customerId\":118,\"rewardId\":3,\"rwdNumber\":\"FG2343 785\"},{\"customerId\":123,\"rewardId\":2,\"rwdNumber\":\"5435 678 CF\"},{\"customerId\":127,\"rewardId\":1,\"rwdNumber\":\"113526 4322\"},{\"customerId\":138,\"rewardId\":1,\"rwdNumber\":\"124256 4322\"},{\"customerId\":140,\"rewardId\":4,\"rwdNumber\":\"4343 23 5435\"},{\"customerId\":142,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"},{\"customerId\":142,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"},{\"customerId\":142,\"rewardId\":1,\"rwdNumber\":\"123456 4322\"}]";
    }
}
