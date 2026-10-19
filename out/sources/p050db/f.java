package p050db;

import kotlin.jvm.internal.i;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: compiled from: JsonConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f34673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f34674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f34675i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f34676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f34677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f34678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f34679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f34680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ClassDiscriminatorMode f34681p;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, ClassDiscriminatorMode classDiscriminatorMode) {
        i.e(prettyPrintIndent, "prettyPrintIndent");
        i.e(classDiscriminator, "classDiscriminator");
        i.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f34667a = z10;
        this.f34668b = z11;
        this.f34669c = z12;
        this.f34670d = z13;
        this.f34671e = z14;
        this.f34672f = z15;
        this.f34673g = prettyPrintIndent;
        this.f34674h = z16;
        this.f34675i = z17;
        this.j = classDiscriminator;
        this.f34676k = z18;
        this.f34677l = z19;
        this.f34678m = z20;
        this.f34679n = z21;
        this.f34680o = z22;
        this.f34681p = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f34667a + ", ignoreUnknownKeys=" + this.f34668b + ", isLenient=" + this.f34669c + ", allowStructuredMapKeys=" + this.f34670d + ", prettyPrint=" + this.f34671e + ", explicitNulls=" + this.f34672f + ", prettyPrintIndent='" + this.f34673g + "', coerceInputValues=" + this.f34674h + ", useArrayPolymorphism=" + this.f34675i + ", classDiscriminator='" + this.j + "', allowSpecialFloatingPointValues=" + this.f34676k + ", useAlternativeNames=" + this.f34677l + ", namingStrategy=null, decodeEnumsCaseInsensitive=" + this.f34678m + ", allowTrailingComma=" + this.f34679n + ", allowComments=" + this.f34680o + ", classDiscriminatorMode=" + this.f34681p + ')';
    }
}
