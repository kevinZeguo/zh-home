import router from '../router/router';

/*
 * localstorage 存储 set
 * Author: yujp
 */
export const setStore = (name, content) => {
    if (!name) return;
    if (typeof content !== 'string') {
        content = JSON.stringify(content);
    }
    window.localStorage.setItem(name, content);
};

/*
 * localstorage 获取 get
 * Author: yujp
 */
export const getStore = name => {
    if (!name) return;

    return window.localStorage.getItem(name);
};

/*
 * localstorage 删除 remove
 * Author: yujp
 */
export const removeStore = name => {
    if (!name) return;

    window.localStorage.removeItem(name);
};

/*
 * 登录判断
 * Author:yujp
 */
export const isSignin = () => {
    const users = getStore('__kettleUsers');

    if (users == null) {
        router.push('/signin');
    }
};

/*
 * 登录判断
 * Author:yujp
 */
export const logout = () => {
    removeStore('__kettleUsers');

    router.push('/signin');
};


export const isvalidPhone = str => {
  const reg = /^1[3|4|5|7|8][0-9]\d{8}$/
  return reg.test(str)
}