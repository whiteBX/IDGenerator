# IDGenerator
**用于生成有序不重复ID，支持分布式部署**

构成为：版本号2位 + 秒级时间30位 + 序列号20位 + 机器id5位 = 57位二进制  
        最高支持64位，其他7位预留用于定制化扩充，比如增加序列号位数或机器id位数

转换为32进制结果示例：d594e2r00000

20位序列号：表示同一秒内可以有2^20次个序列，即1,048,576‬个id，不够可以通过修改配置文件中sequenceLength来扩充

30位时间：修改配置项中beginEpoch为一个时间起点，可用于这个时间起点后三十多年不会重复

5位机器id：表示可以支持2^5即32台服务器部署，不够可以通过修改配置文件中machineIdLength来扩充

**除30位时间占用以为，其他长度都可灵活配置，可通过配置在id长度和id数量间权衡一个需要的结果**
