package com.example.day10java.day10java;

import com.amazonaws.services.ec2.model.*;
import com.example.day10java.day11java.DescribeNetWorkGateWay;
import com.example.day10java.day11java.DescribeVpc;
import com.example.day10java.day8java.DescribeImages;
import com.example.day10java.day8java.DescribeInstance;
import com.example.day10java.day8java.DescribeSnapShots;
import com.example.day10java.day8java.DescribeVolume;

import java.util.List;

public class AwsDaoImp implements AwsDao {

    @Override
    public List<Instance> getAllInstance() throws Exception {
        DescribeInstance describeInstance = new DescribeInstance();
        return describeInstance.call();
    }

    @Override
    public List<Image> getAllImages() throws Exception {
        DescribeImages describeImages = new DescribeImages();
        return describeImages.call();
    }

    @Override
    public List<Snapshot> getAllSnapShots() throws Exception {

        DescribeSnapShots describeSnapShots = new DescribeSnapShots();
        return describeSnapShots.call();
    }

    @Override
    public List<Volume> getAllVolumes() throws Exception {
        DescribeVolume describeVolume = new DescribeVolume();
        return describeVolume.call();
    }

    @Override
    public List<Vpc> getAllVpc() throws Exception {
        DescribeVpc describeVpc = new DescribeVpc();
        return describeVpc.call();
    }

    @Override
    public List<InternetGateway> getAllIGW() throws Exception {
        DescribeNetWorkGateWay describeNetWorkGateWay = new DescribeNetWorkGateWay();
        return describeNetWorkGateWay.call();
    }
}
