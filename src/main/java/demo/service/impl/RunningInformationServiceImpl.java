package demo.service.impl;


import demo.domain.RunningInformation;
import demo.domain.RunningInformationRepository;
import demo.service.RunningInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class RunningInformationServiceImpl implements RunningInformationService {

    private RunningInformationRepository runningInformationRepository;

    //constructor
    @Autowired
    public RunningInformationServiceImpl(RunningInformationRepository runningInformationRepository) {
        this.runningInformationRepository = runningInformationRepository;
    }

    @Override
    public List<RunningInformation> savingRunningInformation(List<RunningInformation> runningInformations) {
        return null;
    }

    @Override
    public Page<RunningInformation> findByHeartRate(int heartRate, Pageable pageable) {
        return null;
    }

    @Override
    public Page<RunningInformation> findByHeartRateGreaterThan(int heartRate, Pageable pageable) {
        return null;
    }

    @Override
    public Page<RunningInformation> findAllRunnngInformationOrderByHealthLevel(Pageable pageable) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
