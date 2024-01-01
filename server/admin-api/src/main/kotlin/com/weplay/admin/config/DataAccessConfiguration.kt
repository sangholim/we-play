package com.weplay.admin.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(value = ["com.weplay.dataaccess"])
class DataAccessConfiguration