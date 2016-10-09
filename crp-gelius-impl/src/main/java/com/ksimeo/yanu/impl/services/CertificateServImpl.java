package com.ksimeo.yanu.impl.services;

import com.ksimeo.yanu.api.dao.CertificateDAO;
import com.ksimeo.yanu.api.services.CertificatesService;
import com.ksimeo.yanu.entities.models.Сert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ksimeo. Created on 19.07.2016 at 13:36 for "crp-gelius" project.
 * @version 1.0
 * @since 1.0
 */
@Service
public class CertificateServImpl implements CertificatesService {
    @Autowired
    private CertificateDAO certDao;

    public Сert addCertificate(Сert certificate) {
        return certDao.save(certificate);
    }

    public Сert getCertificate(int id) {
        return certDao.findOne(id);
    }

    public List<Сert> getCertificates() {
        return certDao.findAll();
    }

    public void deleteCertificate(int id) {

    }
}