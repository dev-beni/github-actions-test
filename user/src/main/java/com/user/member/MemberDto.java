package com.user.member;

import lombok.Data;

@Data
public class MemberDto {

    private String name;
    private String email;
    private String password;
    private String profileImageUrl;
    private String bio;
}
