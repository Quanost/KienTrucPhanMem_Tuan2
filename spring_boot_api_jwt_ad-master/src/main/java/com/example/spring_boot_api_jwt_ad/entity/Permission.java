package com.example.spring_boot_api_jwt_ad.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_permission")
@Getter
@Setter
public class Permission extends BaseEntity {

    private String permissionName;

    private String permissionKey;

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionKey() {
		return permissionKey;
	}

	public void setPermissionKey(String permissionKey) {
		this.permissionKey = permissionKey;
	}

	public Permission(String permissionName, String permissionKey) {
		super();
		this.permissionName = permissionName;
		this.permissionKey = permissionKey;
	}

	public Permission(Long id, String deleted, Date createdAt, Date updatedAt, Long createdBy, Long updatedBy) {
		super(id, deleted, createdAt, updatedAt, createdBy, updatedBy);
	}

	public Permission() {
	}
}