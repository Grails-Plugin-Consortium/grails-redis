package grails.plugins.redis

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

import org.codehaus.groovy.transform.GroovyASTTransformationClass

/**
 */
@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.METHOD])
@GroovyASTTransformationClass(['grails.plugins.redis.ast.MemoizeObjectASTTransformation'])
@interface MemoizeObject {
	Class clazz() default {};
    String key() default '';
    String expire() default '';
}
