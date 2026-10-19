package com.voltasit.parse.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("ControlUnitLabel")
public final class ControlUnitLabelDB extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34408b = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f34409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f34410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Type f34411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Type f34412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f34413f;

        static {
            Type type = new Type("MEASUREMENT", 0);
            f34409b = type;
            Type type2 = new Type("CODING", 1);
            f34410c = type2;
            Type type3 = new Type("LONG_CODING", 2);
            Type type4 = new Type("ADAPTATION", 3);
            f34411d = type4;
            Type type5 = new Type("LONG_ADAPTATION", 4);
            Type type6 = new Type("BASIC_SETTINGS", 5);
            f34412e = type6;
            f34413f = new Type[]{type, type2, type3, type4, type5, type6, new Type("OUTPUT_TEST", 6)};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f34413f.clone();
        }
    }
}
