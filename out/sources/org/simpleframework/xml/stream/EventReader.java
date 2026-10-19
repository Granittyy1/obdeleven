package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
interface EventReader {
    EventNode next() throws Exception;

    EventNode peek() throws Exception;
}
