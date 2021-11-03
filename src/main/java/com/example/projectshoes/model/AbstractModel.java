package com.example.projectshoes.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public class AbstractModel<T> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Timestamp createdDate;

  private Timestamp modifiedDate;

  private String createdBy;

  private String modifiedBy;
  @Transient

  private String message;
  @Transient

  private String alert;
  @Transient

  private long[] ids;
  @Transient

  private List<T> listResult = new ArrayList<>();
  @Transient

  private Integer page;
  @Transient

  private Integer maxPageItem;
  @Transient

  private Integer totalItem;
  @Transient

  private Integer totalPage;

  public long[] getIds() {
    return ids;
  }

  public void setIds(long[] ids) {
    this.ids = ids;
  }

  public List<T> getListResult() {
    return listResult;
  }

  public void setListResult(List<T> listResult) {
    this.listResult = listResult;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Timestamp getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Timestamp createdDate) {
    this.createdDate = createdDate;
  }

  public Timestamp getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Timestamp modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getAlert() {
    return alert;
  }

  public void setAlert(String alert) {
    this.alert = alert;
  }

  public Integer getMaxPageItem() {
    return maxPageItem;
  }

  public void setMaxPageItem(Integer maxPageItem) {
    this.maxPageItem = maxPageItem;
  }


  public Integer getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }

  public Integer getTotalItem() {
    return totalItem;
  }

  public void setTotalItem(Integer totalItem) {
    this.totalItem = totalItem;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }
}
