package springboot.bootdemo.util;

public class AlipayConfig {
    //
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016093000635195";

	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCG1BtBMCTZTRAvaJGorxXjGoyV2HPjQKkQLhDdEMKJchUrgef5MA2+jxEqLRKL9BAKQ+gKb1QvyRu1mCLaBj8cH/MKQQDMJrF7ZWeGhpdqvJFAqbuYZrsahc24s82OVYG8linn0wUu56m+Ds4aXTbM1x5wZDUBaxitNiyELQZoHVOmTY5uiGt2yxvycs9f0b8RUBWf5RdXg/cAlpZFe+NHW7V9l5AmEBLVF+klp1VkKy2VehBZLkP0f6qyeGOpPUXN/y4rOrNz1ymmyrQZC0Cyh4TYdeqrdvMR307rbeYvIWVkPxD9UMcrdME3xAGQr6oigNT1WLjkH4SorQL7nbrDAgMBAAECggEAEDg7/x+XjzyiEdH2k+BcNbHf77bWWiRRMk0YYj+952L+APnjuip5vM7hNb2uWX/G3jVFGNxDuGvtFW9z4d6WgP+m8TjYq7aL61hLl/dhB8offzPsCW1yXMJz+SBIPjMzJEi8SdMs8HOWC/MkAC/ug73tP4AOkFkd4th9inkQKD4SOQJv/mLf8mp+cmGQNSqxMxX1tm9/ZoiMFQih6WTaFFuR63i39BangX1OXt+yrYky97JlWiqhGYmq6QYMoBeQXanwpqbqV9NKnbPbH8dTjDlUgjL4vsTpwBNf2noiXtimUFQNLtnFIjM4f9kb7sdIgJAlfvdiW26lYzmHzpuigQKBgQC9K2JtZqRROWy8lYYS+YANpA3tK/Ootg9B3cV1P5YiRdEumQl3M1vBGIgMmThqIyn1JOJmItNys/smVNt1bRwoHKED1XUjDbcEl60fHeA7g/uoh+FL8h1HHmaGStF2pK3le67Y8e0IhBIzVEUuJGdTW+W/shLePWbZlNoNtn6h8QKBgQC2dhdi/Bu/JkzPbIKqxtuupDnzDtrF2KhyMdw0DNJJ3R7HmxXYHC6uunUcL3/iHz010CRsoR6TStGF935av29rtn0An489kwMZ/JeD+nBmWWEa7w4YXj+MW3jJN3iPddTf3EcLqPjZ7ijtpJRkxBvxNkjM0ROtGcPxBhdwIpcz8wKBgB8XxnHc8R04pxrIKOVthRK46GEXXFFau19EKHSBIxg3CY7zMI8bLfWrJpGLja5EYV0d1uiayM6NrrY6NGg0qvAc5IpQx5QfaPmkRJxcuMKPiwnEa8+j2BQcdxWTrqIlpz+U+MRH34IK00MEkupmqWUWMck0Z82HoiQZR04BtQbBAoGAKxbmXPz2vISZ/R4+GYCO3sZv3QO0DKcm2JkHzM7+Vm0+2Jq6ZOf66k6kW3yoMcl41h2KjJDcPKKdqoqRL3MoKALXsG7+D+eJAvkQ+x0IsFMJSKgN5xlS3p23f6V29kI4fIlzycAkzKqexchpNwbNJoDQXnY9tFJyYJg0rsmsdZsCgYBB+A3hIN1QJJGuvf5sJz0uwylJE7yXVGu0q5usjKZ10BraSkN6rxLAOXUVeSeIsSNRcAv1MzHzStwT+mTU3vLfGwVvKx9/XoyyMrpge9oiQmHDMYdpOB1rcZjyJNhFUh/WjM+BVkhchBEsK/D6Q7ktI/wcb/9vyi36JSEnrRdTKA==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8090/payController/notify_url";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8090/payController/retunurl";

	// 签名方式
	public static String sign_type = "RSA";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";
}
