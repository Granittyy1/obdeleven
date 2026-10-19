package androidx.compose.ui.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
final class AnnotationType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnnotationType f15292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AnnotationType f15293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AnnotationType f15294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AnnotationType f15295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AnnotationType f15296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AnnotationType f15297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AnnotationType f15298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AnnotationType[] f15299i;

    static {
        AnnotationType annotationType = new AnnotationType("Paragraph", 0);
        f15292b = annotationType;
        AnnotationType annotationType2 = new AnnotationType("Span", 1);
        f15293c = annotationType2;
        AnnotationType annotationType3 = new AnnotationType("VerbatimTts", 2);
        f15294d = annotationType3;
        AnnotationType annotationType4 = new AnnotationType("Url", 3);
        f15295e = annotationType4;
        AnnotationType annotationType5 = new AnnotationType("Link", 4);
        f15296f = annotationType5;
        AnnotationType annotationType6 = new AnnotationType("Clickable", 5);
        f15297g = annotationType6;
        AnnotationType annotationType7 = new AnnotationType("String", 6);
        f15298h = annotationType7;
        AnnotationType[] annotationTypeArr = {annotationType, annotationType2, annotationType3, annotationType4, annotationType5, annotationType6, annotationType7};
        f15299i = annotationTypeArr;
        kotlin.enums.a.a(annotationTypeArr);
    }

    public AnnotationType() {
        throw null;
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) f15299i.clone();
    }
}
