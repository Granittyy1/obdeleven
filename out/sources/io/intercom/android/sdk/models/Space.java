package io.intercom.android.sdk.models;

import Ba.a;
import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Space.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Space {
    public static final int $stable = 0;

    @b("label")
    private final String label;

    @b("type")
    private final Type type;

    /* JADX INFO: compiled from: Space.kt */
    public enum Type {
        HOME,
        MESSAGES,
        HELP,
        TICKETS;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

        public static a<Type> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Space() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Space copy$default(Space space, Type type, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            type = space.type;
        }
        if ((i10 & 2) != 0) {
            str = space.label;
        }
        return space.copy(type, str);
    }

    public final Type component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final Space copy(Type type, String str) {
        i.e(type, "type");
        return new Space(type, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Space)) {
            return false;
        }
        Space space = (Space) obj;
        return this.type == space.type && i.a(this.label, space.label);
    }

    public final String getLabel() {
        return this.label;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Space(type=");
        sb2.append(this.type);
        sb2.append(", label=");
        return B7.b.g(sb2, this.label, ')');
    }

    public Space(Type type, String str) {
        i.e(type, "type");
        this.type = type;
        this.label = str;
    }

    public /* synthetic */ Space(Type type, String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? Type.HOME : type, (i10 & 2) != 0 ? null : str);
    }
}
