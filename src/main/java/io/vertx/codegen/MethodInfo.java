package io.vertx.codegen;

/*
 * Copyright 2014 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */

import java.util.List;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class MethodInfo {

  final String name;
  final String returnType;
  final boolean fluent;
  final boolean indexGetter;
  final boolean indexSetter;
  final List<ParamInfo> params;
  final String comment;

  public MethodInfo(String name, String returnType, boolean fluent, boolean indexGetter, boolean indexSetter,
                    List<ParamInfo> params, String comment) {
    this.name = name;
    this.returnType = returnType;
    this.fluent = fluent;
    this.indexGetter = indexGetter;
    this.indexSetter = indexSetter;
    this.params = params;
    this.comment = comment;
  }

  public String getName() {
    return name;
  }

  public String getReturnType() {
    return returnType;
  }

  public boolean isFluent() {
    return fluent;
  }

  public boolean isIndexGetter() {
    return indexGetter;
  }

  public boolean isIndexSetter() {
    return indexSetter;
  }

  public List<ParamInfo> getParams() {
    return params;
  }

  public String getComment() {
    return comment;
  }
}