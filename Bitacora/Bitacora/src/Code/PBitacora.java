
package Code;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
/**
 *
 * @author Brayan Hurtado
 */
public class PBitacora implements TableModel{
private List<Bitacora> lista;

    public PBitacora(List<Bitacora> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int index) {
        switch(index){
            case 0:
                return "Usuario";
            case 1:
                return "Fecha";
            case 2:
                return "Hora Inicio ";
                   case 3:
                return "Hora Final";
           default:
                return "Descripcion";
            
        }
    }

    @Override
    public Class<?> getColumnClass(int column) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Bitacora sol = lista.get(row);
        
        switch (column) {
            case 0:
                return sol.getUsuario(); // ????? get o set?
            case 1:
                return sol.getFecha();
            case 2:
                return sol.getHoraInicio();
            case 3:
                return sol.getHoraFinal();
           default:
                return sol.getDescripcion();
            
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        //
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        //
    }
    
}