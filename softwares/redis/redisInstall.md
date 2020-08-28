##### 确保 gcc 和 g++ 已更新到最新版本
##### 操作：
```
1. wget http://download.redis.io/releases/redis-6.0.6.tar.gz
2. tar -zxvf redis-6.0.6.tar.gz
3. cd redis-6.0.6
4. make

```
##### 添加路径到环境变量
```
1. pwd  # 查看 src 路径
    我的 src 路径是  /home/zhiyong/computer/redis/linux_redis/redis-6.0.6/src

2. vim ~/.bashrc   # 添加路径到 ~/.bashrc
    export PATH="$PATH:/home/zhiyong/computer/redis/linux_redis/redis-6.0.6/src"
    退出，输入：source ~/.bashrc

```

##### 使用 redis
```
1. open a terminal, enter:
    redis-server
2. open another terminal, enter:
    redis-cli
```



