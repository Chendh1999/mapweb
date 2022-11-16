package com.cc.service;

import com.cc.model.PointModel;

import java.util.List;

public interface MapService {
    List<PointModel> getCntyPointByGid(Integer gId);
    int addCntyPoint(PointModel pointModel);
    int modifyCntyPoint(PointModel pointModel);
    int removeCntyPoint(Integer gId);
}
