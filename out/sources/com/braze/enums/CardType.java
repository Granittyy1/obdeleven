package com.braze.enums;

import kotlin.jvm.internal.e;

/* JADX INFO: loaded from: classes.dex */
public enum CardType {
    IMAGE,
    CAPTIONED_IMAGE,
    DEFAULT,
    SHORT_NEWS,
    TEXT_ANNOUNCEMENT,
    CONTROL;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final CardType fromValue(int i10) {
            return CardType.values()[i10];
        }

        private Companion() {
        }
    }

    public static final CardType fromValue(int i10) {
        return Companion.fromValue(i10);
    }

    public final int getValue() {
        return ordinal();
    }
}
