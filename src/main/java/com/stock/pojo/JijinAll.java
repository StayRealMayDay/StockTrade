package com.stock.pojo;

public class JijinAll {
    private Integer id;

    private String jijiBianhao;

    private String jijiJiancheng;

    private String jijinHanzi;

    private String jijinType;

    private String jijinEng;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJijiBianhao() {
        return jijiBianhao;
    }

    public void setJijiBianhao(String jijiBianhao) {
        this.jijiBianhao = jijiBianhao == null ? null : jijiBianhao.trim();
    }

    public String getJijiJiancheng() {
        return jijiJiancheng;
    }

    public void setJijiJiancheng(String jijiJiancheng) {
        this.jijiJiancheng = jijiJiancheng == null ? null : jijiJiancheng.trim();
    }

    public String getJijinHanzi() {
        return jijinHanzi;
    }

    public void setJijinHanzi(String jijinHanzi) {
        this.jijinHanzi = jijinHanzi == null ? null : jijinHanzi.trim();
    }

    public String getJijinType() {
        return jijinType;
    }

    public void setJijinType(String jijinType) {
        this.jijinType = jijinType == null ? null : jijinType.trim();
    }

    public String getJijinEng() {
        return jijinEng;
    }

    public void setJijinEng(String jijinEng) {
        this.jijinEng = jijinEng == null ? null : jijinEng.trim();
    }
}