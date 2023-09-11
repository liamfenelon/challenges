import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitioningIntoMinNumOfDeciBinaryNumsTest {

    @Test
    public void lessThan82734Test(){
        PartitioningIntoMinNumOfDeciBinaryNums partitioning = new PartitioningIntoMinNumOfDeciBinaryNums();
        assertEquals(8, partitioning.minPartitions("82734"));
    }

    @Test
    public void deciBinaryThirtyTwo(){
        PartitioningIntoMinNumOfDeciBinaryNums partitioning = new PartitioningIntoMinNumOfDeciBinaryNums();
        assertEquals(3, partitioning.minPartitions("32"));
    }
}
