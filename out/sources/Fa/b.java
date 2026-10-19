package Fa;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC2669a;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.i;
import kotlin.sequences.g;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements g<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f3333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f3334b;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class a extends c {
    }

    /* JADX INFO: renamed from: Fa.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public final class C0036b extends AbstractC2669a<File> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayDeque<c> f3335d;

        /* JADX INFO: renamed from: Fa.b$b$a */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f3337b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f3338c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f3339d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f3340e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ C0036b f3341f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0036b c0036b, File rootDir) {
                super(rootDir);
                i.e(rootDir, "rootDir");
                this.f3341f = c0036b;
            }

            @Override // Fa.b.c
            public final File a() {
                boolean z10 = this.f3340e;
                File file = this.f3347a;
                C0036b c0036b = this.f3341f;
                if (!z10 && this.f3338c == null) {
                    b.this.getClass();
                    File[] fileArrListFiles = file.listFiles();
                    this.f3338c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        b.this.getClass();
                        this.f3340e = true;
                    }
                }
                File[] fileArr = this.f3338c;
                if (fileArr != null && this.f3339d < fileArr.length) {
                    i.b(fileArr);
                    int i10 = this.f3339d;
                    this.f3339d = i10 + 1;
                    return fileArr[i10];
                }
                if (this.f3337b) {
                    b.this.getClass();
                    return null;
                }
                this.f3337b = true;
                return file;
            }
        }

        /* JADX INFO: renamed from: Fa.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class C0037b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f3342b;

            @Override // Fa.b.c
            public final File a() {
                if (this.f3342b) {
                    return null;
                }
                this.f3342b = true;
                return this.f3347a;
            }
        }

        /* JADX INFO: renamed from: Fa.b$b$c */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f3343b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f3344c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f3345d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0036b f3346e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C0036b c0036b, File rootDir) {
                super(rootDir);
                i.e(rootDir, "rootDir");
                this.f3346e = c0036b;
            }

            @Override // Fa.b.c
            public final File a() {
                boolean z10 = this.f3343b;
                File file = this.f3347a;
                C0036b c0036b = this.f3346e;
                if (!z10) {
                    b.this.getClass();
                    this.f3343b = true;
                    return file;
                }
                File[] fileArr = this.f3344c;
                if (fileArr != null && this.f3345d >= fileArr.length) {
                    b.this.getClass();
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f3344c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        b.this.getClass();
                    }
                    File[] fileArr2 = this.f3344c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        b.this.getClass();
                        return null;
                    }
                }
                File[] fileArr3 = this.f3344c;
                i.b(fileArr3);
                int i10 = this.f3345d;
                this.f3345d = i10 + 1;
                return fileArr3[i10];
            }
        }

        public C0036b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f3335d = arrayDeque;
            if (b.this.f3333a.isDirectory()) {
                arrayDeque.push(b(b.this.f3333a));
            } else {
                if (!b.this.f3333a.isFile()) {
                    this.f42986b = 2;
                    return;
                }
                File rootFile = b.this.f3333a;
                i.e(rootFile, "rootFile");
                arrayDeque.push(new C0037b(rootFile));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC2669a
        public final void a() {
            T t8;
            while (true) {
                ArrayDeque<c> arrayDeque = this.f3335d;
                c cVarPeek = arrayDeque.peek();
                if (cVarPeek != null) {
                    File fileA = cVarPeek.a();
                    if (fileA != null) {
                        if (!fileA.equals(cVarPeek.f3347a) && fileA.isDirectory()) {
                            int size = arrayDeque.size();
                            b.this.getClass();
                            if (size < Integer.MAX_VALUE) {
                                arrayDeque.push(b(fileA));
                            }
                        }
                        t8 = fileA;
                        break;
                    }
                    arrayDeque.pop();
                } else {
                    t8 = 0;
                    break;
                }
            }
            if (t8 == 0) {
                this.f42986b = 2;
            } else {
                this.f42987c = t8;
                this.f42986b = 1;
            }
        }

        public final a b(File file) {
            int iOrdinal = b.this.f3334b.ordinal();
            if (iOrdinal == 0) {
                return new c(this, file);
            }
            if (iOrdinal == 1) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f3347a;

        public c(File root) {
            i.e(root, "root");
            this.f3347a = root;
        }

        public abstract File a();
    }

    public b(File start) {
        FileWalkDirection fileWalkDirection = FileWalkDirection.f43043b;
        i.e(start, "start");
        this.f3333a = start;
        this.f3334b = fileWalkDirection;
    }

    @Override // kotlin.sequences.g
    public final Iterator<File> iterator() {
        return new C0036b();
    }
}
