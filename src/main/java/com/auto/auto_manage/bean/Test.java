package com.auto.auto_manage.bean;

public class Test {
    private Integer id;

    private String colcode;

    private String sqlstr;

    private String colname;

    private Double count;

    private Double distinctcount;

    private Double discretizationCountDis;

    private Double gain;

    private Double gainrate;

    private Double gini;

    private Double chiSquare;

    private Double nullrate;

    private String isdrop;

    private String datatype;

    private String inferDataType;

    private String dorpstatus;

    private String resulttablename;

    private String version;

    private String createtime;

    private String updatetime;

    private String discretizationMsg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColcode() {
        return colcode;
    }

    public void setColcode(String colcode) {
        this.colcode = colcode == null ? null : colcode.trim();
    }

    public String getSqlstr() {
        return sqlstr;
    }

    public void setSqlstr(String sqlstr) {
        this.sqlstr = sqlstr == null ? null : sqlstr.trim();
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname == null ? null : colname.trim();
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Double getDistinctcount() {
        return distinctcount;
    }

    public void setDistinctcount(Double distinctcount) {
        this.distinctcount = distinctcount;
    }

    public Double getDiscretizationCountDis() {
        return discretizationCountDis;
    }

    public void setDiscretizationCountDis(Double discretizationCountDis) {
        this.discretizationCountDis = discretizationCountDis;
    }

    public Double getGain() {
        return gain;
    }

    public void setGain(Double gain) {
        this.gain = gain;
    }

    public Double getGainrate() {
        return gainrate;
    }

    public void setGainrate(Double gainrate) {
        this.gainrate = gainrate;
    }

    public Double getGini() {
        return gini;
    }

    public void setGini(Double gini) {
        this.gini = gini;
    }

    public Double getChiSquare() {
        return chiSquare;
    }

    public void setChiSquare(Double chiSquare) {
        this.chiSquare = chiSquare;
    }

    public Double getNullrate() {
        return nullrate;
    }

    public void setNullrate(Double nullrate) {
        this.nullrate = nullrate;
    }

    public String getIsdrop() {
        return isdrop;
    }

    public void setIsdrop(String isdrop) {
        this.isdrop = isdrop == null ? null : isdrop.trim();
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public String getInferDataType() {
        return inferDataType;
    }

    public void setInferDataType(String inferDataType) {
        this.inferDataType = inferDataType == null ? null : inferDataType.trim();
    }

    public String getDorpstatus() {
        return dorpstatus;
    }

    public void setDorpstatus(String dorpstatus) {
        this.dorpstatus = dorpstatus == null ? null : dorpstatus.trim();
    }

    public String getResulttablename() {
        return resulttablename;
    }

    public void setResulttablename(String resulttablename) {
        this.resulttablename = resulttablename == null ? null : resulttablename.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public String getDiscretizationMsg() {
        return discretizationMsg;
    }

    public void setDiscretizationMsg(String discretizationMsg) {
        this.discretizationMsg = discretizationMsg == null ? null : discretizationMsg.trim();
    }
}