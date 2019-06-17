package com.springcloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User���Ӧ��ʵ���ࣺ���ڷ�װUSERS����һ���û���Ϣ
 * @author Administrator
 *
 */
@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements java.io.Serializable{

	private static final long serialVersionUID = 2504015899170623862L;
	/**
	 * �û����
	 */
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	/**
	 * �û�����
	 */
	@Column(name="user_name")
	private String userName;
	/**
	 * �û����֤��
	 */
	@Column(name="user_number")
	private String userNumber;
	/**
	 * �û�����
	 */
	@Column(name="user_password")
	private String userPassword;
	/**
	 * ��������
	 */
	@Column(name="user_birthday")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date userBirthday;
	/**
	 * �û��Ա�,��Ϊ0,1ΪŮ
	 */
	@Column(name="user_sex")
	private Integer userSex;
	/**
	 * ͷ��
	 */
	@Column(name="user_photo")
	private String userPhoto;
	/**
	 * �û�����
	 */
	@Column(name="user_email")
	private String userEmail;
	/**
	 * �绰����
	 */
	@Column(name="user_phone")
	private String userPhone;
	/**
	 * �û�״̬
	 */
	@Column(name="user_status")
	private Integer userStatus;
	/**
	 * Ȩ�ޱ��
	 */
	@Column(name="jdiction_id")
	private Integer jdictionId;
	/**
	 * �û���ַ
	 */ 
	@Column(name="user_site")
	private String userSite;

}
