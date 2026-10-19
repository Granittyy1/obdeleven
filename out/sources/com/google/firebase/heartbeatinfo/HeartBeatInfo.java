package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes3.dex */
public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        /* JADX INFO: Fake field, exist only in values array */
        SDK(1),
        GLOBAL(2),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(3);

        private final int code;

        HeartBeat(int i10) {
            this.code = i10;
        }

        public final int a() {
            return this.code;
        }
    }

    HeartBeat b();
}
