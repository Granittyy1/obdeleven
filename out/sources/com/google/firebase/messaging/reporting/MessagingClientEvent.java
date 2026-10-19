package com.google.firebase.messaging.reporting;

import O6.b;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagingClientEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MessageType f28394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f28399i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f28400k;

    public enum Event implements b {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i10) {
            this.number_ = i10;
        }

        @Override // O6.b
        public final int a() {
            return this.number_;
        }
    }

    public enum MessageType implements b {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i10) {
            this.number_ = i10;
        }

        @Override // O6.b
        public final int a() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements b {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);

        private final int number_;

        SDKPlatform(int i10) {
            this.number_ = i10;
        }

        @Override // O6.b
        public final int a() {
            return this.number_;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, String str3, String str4, int i10, int i11, String str5, String str6, String str7) {
        this.f28391a = j;
        this.f28392b = str;
        this.f28393c = str2;
        this.f28394d = messageType;
        this.f28395e = str3;
        this.f28396f = str4;
        this.f28397g = i10;
        this.f28398h = i11;
        this.f28399i = str5;
        this.j = str6;
        this.f28400k = str7;
    }
}
