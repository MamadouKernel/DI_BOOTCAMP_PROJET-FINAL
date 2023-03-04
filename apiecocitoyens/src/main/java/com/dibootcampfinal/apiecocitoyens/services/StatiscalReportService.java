package com.dibootcampfinal.apiecocitoyens.services;

import com.dibootcampfinal.apiecocitoyens.models.StatisticalReport;

import java.util.List;
import java.util.Optional;

public interface StatiscalReportService {
    StatisticalReport AddStatisticalReport(StatisticalReport statisticalReport);
    List<StatisticalReport> ShowAll();
    Optional<StatisticalReport> Show(Long id);
    StatisticalReport UpdateStatisticalReport(Long id,StatisticalReport statisticalReport);
    StatisticalReport DeleteStatisticalReport(Long id);

}
