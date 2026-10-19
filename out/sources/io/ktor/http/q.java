package io.ktor.http;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.LinkedHashMap;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HttpStatusCode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable<q> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f40497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f40498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f40499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f40500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f40501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f40502i;
    public static final q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f40503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f40504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f40505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f40506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f40507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f40508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f40509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final List<q> f40510r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40512c;

    static {
        q qVar = new q(100, "Continue");
        q qVar2 = new q(R.styleable.AppCompatTheme_switchStyle, "Switching Protocols");
        q qVar3 = new q(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "Processing");
        q qVar4 = new q(androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION, "OK");
        q qVar5 = new q(201, "Created");
        q qVar6 = new q(202, "Accepted");
        q qVar7 = new q(203, "Non-Authoritative Information");
        q qVar8 = new q(204, "No Content");
        q qVar9 = new q(205, "Reset Content");
        q qVar10 = new q(206, "Partial Content");
        q qVar11 = new q(207, "Multi-Status");
        q qVar12 = new q(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, "Multiple Choices");
        q qVar13 = new q(301, "Moved Permanently");
        f40497d = qVar13;
        q qVar14 = new q(302, "Found");
        f40498e = qVar14;
        q qVar15 = new q(303, "See Other");
        f40499f = qVar15;
        q qVar16 = new q(304, "Not Modified");
        q qVar17 = new q(305, "Use Proxy");
        q qVar18 = new q(306, "Switch Proxy");
        q qVar19 = new q(307, "Temporary Redirect");
        f40500g = qVar19;
        q qVar20 = new q(308, "Permanent Redirect");
        f40501h = qVar20;
        q qVar21 = new q(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Bad Request");
        q qVar22 = new q(401, "Unauthorized");
        q qVar23 = new q(402, "Payment Required");
        q qVar24 = new q(403, "Forbidden");
        q qVar25 = new q(404, "Not Found");
        f40502i = qVar25;
        q qVar26 = new q(405, "Method Not Allowed");
        q qVar27 = new q(406, "Not Acceptable");
        q qVar28 = new q(407, "Proxy Authentication Required");
        q qVar29 = new q(408, "Request Timeout");
        j = qVar29;
        q qVar30 = new q(409, "Conflict");
        f40503k = qVar30;
        q qVar31 = new q(410, "Gone");
        q qVar32 = new q(411, "Length Required");
        q qVar33 = new q(412, "Precondition Failed");
        q qVar34 = new q(413, "Payload Too Large");
        q qVar35 = new q(414, "Request-URI Too Long");
        q qVar36 = new q(415, "Unsupported Media Type");
        q qVar37 = new q(416, "Requested Range Not Satisfiable");
        q qVar38 = new q(417, "Expectation Failed");
        q qVar39 = new q(422, "Unprocessable Entity");
        q qVar40 = new q(423, "Locked");
        q qVar41 = new q(424, "Failed Dependency");
        q qVar42 = new q(425, "Too Early");
        q qVar43 = new q(426, "Upgrade Required");
        q qVar44 = new q(429, "Too Many Requests");
        f40504l = qVar44;
        q qVar45 = new q(431, "Request Header Fields Too Large");
        q qVar46 = new q(500, "Internal Server Error");
        f40505m = qVar46;
        q qVar47 = new q(501, "Not Implemented");
        q qVar48 = new q(502, "Bad Gateway");
        f40506n = qVar48;
        q qVar49 = new q(503, "Service Unavailable");
        f40507o = qVar49;
        q qVar50 = new q(504, "Gateway Timeout");
        f40508p = qVar50;
        q qVar51 = new q(505, "HTTP Version Not Supported");
        q qVar52 = new q(506, "Variant Also Negotiates");
        q qVar53 = new q(507, "Insufficient Storage");
        f40509q = qVar53;
        List<q> listS = kotlin.collections.l.s(qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, qVar15, qVar16, qVar17, qVar18, qVar19, qVar20, qVar21, qVar22, qVar23, qVar24, qVar25, qVar26, qVar27, qVar28, qVar29, qVar30, qVar31, qVar32, qVar33, qVar34, qVar35, qVar36, qVar37, qVar38, qVar39, qVar40, qVar41, qVar42, qVar43, qVar44, qVar45, qVar46, qVar47, qVar48, qVar49, qVar50, qVar51, qVar52, qVar53);
        f40510r = listS;
        List<q> list = listS;
        int iN = kotlin.collections.x.n(kotlin.collections.m.y(list, 10));
        if (iN < 16) {
            iN = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((q) obj).f40511b), obj);
        }
    }

    public q(int i10, String description) {
        kotlin.jvm.internal.i.e(description, "description");
        this.f40511b = i10;
        this.f40512c = description;
    }

    @Override // java.lang.Comparable
    public final int compareTo(q qVar) {
        q other = qVar;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f40511b - other.f40511b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && ((q) obj).f40511b == this.f40511b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40511b);
    }

    public final String toString() {
        return this.f40511b + ' ' + this.f40512c;
    }
}
