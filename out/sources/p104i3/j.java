package p104i3;

import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p116j3.p;

/* JADX INFO: compiled from: MergePathsContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f36670a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f36671b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f36672c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f36673d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MergePaths f36674e;

    public j(MergePaths mergePaths) {
        mergePaths.getClass();
        this.f36674e = mergePaths;
    }

    public final void a(Path.Op op) {
        Matrix matrixD;
        Matrix matrixD2;
        Path path = this.f36671b;
        path.reset();
        Path path2 = this.f36670a;
        path2.reset();
        ArrayList arrayList = this.f36673d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            k kVar = (k) arrayList.get(size);
            if (kVar instanceof c) {
                c cVar = (c) kVar;
                ArrayList arrayList2 = (ArrayList) cVar.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((k) arrayList2.get(size2)).getPath();
                    p pVar = cVar.j;
                    if (pVar != null) {
                        matrixD2 = pVar.d();
                    } else {
                        matrixD2 = cVar.f36621c;
                        matrixD2.reset();
                    }
                    path3.transform(matrixD2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(kVar.getPath());
            }
        }
        int i10 = 0;
        k kVar2 = (k) arrayList.get(0);
        if (kVar2 instanceof c) {
            c cVar2 = (c) kVar2;
            List<k> listD = cVar2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listD;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((k) arrayList3.get(i10)).getPath();
                p pVar2 = cVar2.j;
                if (pVar2 != null) {
                    matrixD = pVar2.d();
                } else {
                    matrixD = cVar2.f36621c;
                    matrixD.reset();
                }
                path4.transform(matrixD);
                path2.addPath(path4);
                i10++;
            }
        } else {
            path2.set(kVar2.getPath());
        }
        this.f36672c.op(path2, path, op);
    }

    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36673d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((k) arrayList.get(i10)).b(list, list2);
            i10++;
        }
    }

    @Override // p104i3.i
    public final void d(ListIterator<b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            b bVarPrevious = listIterator.previous();
            if (bVarPrevious instanceof k) {
                this.f36673d.add((k) bVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // p104i3.k
    public final Path getPath() {
        Path path = this.f36672c;
        path.reset();
        MergePaths mergePaths = this.f36674e;
        if (mergePaths.f23392b) {
            return path;
        }
        int iOrdinal = mergePaths.f23391a.ordinal();
        if (iOrdinal == 0) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f36673d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                path.addPath(((k) arrayList.get(i10)).getPath());
                i10++;
            }
        } else if (iOrdinal == 1) {
            a(Path.Op.UNION);
        } else if (iOrdinal == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (iOrdinal == 3) {
            a(Path.Op.INTERSECT);
        } else if (iOrdinal == 4) {
            a(Path.Op.XOR);
        }
        return path;
    }
}
