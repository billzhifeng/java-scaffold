# java-scaffold
脚手架工程
字符集 UTF-8

启动查看 http://localhost:9999/ok
访问数据源管理 http://localhost:9999/druid/index.html
MySQL默认字符集全局使用utf8mb4 + utf8mb4_general_ci，以兼容现在常用的emoji等超宽字符。

1.自定义logger name 
	<logger name="JOB-LOGGER" level="INFO" additivity="false">
		<appender-ref ref="JOB-APPENDER" />
		<appender-ref ref="JOB-ERROR-APPENDER" />
	使用如下
	public abstract class PageDoJobService<T> {
    	private Logger                  jobLogger = LoggerFactory.getLogger("JOB-LOGGER");

2.
