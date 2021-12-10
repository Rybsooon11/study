package com.mgr.badanie.recounting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class GrossNetServiceImpl implements GrossNetService {

    @Value("${tax.rate}")
    private int taxRate;

    @Override
    public BigDecimal grossToNet(BigDecimal gross) {
        return gross.divide(new BigDecimal("1.23"), RoundingMode.UP);
    }

    @Override
    public BigDecimal NetToGross(BigDecimal net) {
        return net.multiply(getTaxRate());
    }

    private BigDecimal getTaxRate() {
        return new BigDecimal(taxRate).divide(new BigDecimal(100), RoundingMode.UP);
    }
}