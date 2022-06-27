package com.dailycodebuffer.user.VO;

import com.dailycodebuffer.user.entity.People;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private People user;
    private Department department;
}
