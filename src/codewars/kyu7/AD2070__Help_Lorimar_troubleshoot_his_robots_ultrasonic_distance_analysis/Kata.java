package codewars.kyu7.AD2070__Help_Lorimar_troubleshoot_his_robots_ultrasonic_distance_analysis;

import java.util.stream.DoubleStream;

public class Kata {
    public static double[] sensorAnalysis(Object[][] sensor_data) {
        double[] nums = new double[sensor_data.length];
        double accu = 0;
        for (int i = 0; i < sensor_data.length; i++)
            accu += (nums[i] = (double) sensor_data[i][1]);
        double mean = accu / sensor_data.length;
        double standardDeviation = (Math.round((Math.sqrt(DoubleStream.of(nums)
                .map(x -> Math.pow(x - mean, 2f))
                .sum() / (nums.length - 1))) * 10e3)) / 10e3;

        return new double[]{Math.round(mean * 10e3) / 10e3, standardDeviation};
    }
}