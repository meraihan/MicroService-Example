package com.meraihan.user.service.VO;

import com.meraihan.user.service.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sayed Mahmud Raihan
 * @Project department-service
 * @Created 01/07/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;
}
