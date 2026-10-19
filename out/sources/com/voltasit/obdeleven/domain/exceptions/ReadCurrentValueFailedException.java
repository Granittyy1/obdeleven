package com.voltasit.obdeleven.domain.exceptions;

import kotlin.enums.a;

/* JADX INFO: compiled from: ReadCurrentValueFailedException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ReadCurrentValueFailedException extends Exception {
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: ReadCurrentValueFailedException.kt */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f30423b;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        static {
            Type[] typeArr = {new Type("NotSupported", 0), new Type("IgnitionOff", 1), new Type("SaveOriginalFailed", 2), new Type("Unknown", 3)};
            f30423b = typeArr;
            a.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f30423b.clone();
        }
    }
}
