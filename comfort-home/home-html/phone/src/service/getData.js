import axios from 'axios';
import { openUrl } from '../config/env';

import req from '../config/axios';

/*
 * 统一认证系统接口
 * Author: yujp
 */

// 用户登录
export const login = param => {
	return req.post('system/auth/login', param);
};

