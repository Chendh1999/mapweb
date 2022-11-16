package com.cc.dao;

import com.cc.model.PointModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MapDao {
    //@Param注释里的gld是sql中的#{gld}
    List<PointModel> getCntyPoint(@Param("gId") Integer gId);
    int insertCntyPoint(PointModel pointModel);
    int updateCntyPoint(PointModel pointModel);
    int deleteCntyPoint(@Param("gId") Integer gId);

}
