package l33JavaCoreFinal.homeWork33.service;

import l33JavaCoreFinal.homeWork33.db.NoteDAO;
import l33JavaCoreFinal.homeWork33.db.NoteDaoImpl;
import l33JavaCoreFinal.homeWork33.dto.NoteDTO;
import l33JavaCoreFinal.homeWork33.mapper.NoteMapper;

import java.sql.SQLException;
import java.util.List;

public class NoteServiceImpl implements NoteService{

    private final NoteDAO noteDAO;

    private final NoteMapper noteMapper;

    public NoteServiceImpl() throws SQLException {
        this.noteDAO = new NoteDaoImpl();
        this.noteMapper = new NoteMapper();
    }

    @Override
    public NoteDTO findById(Integer id) {
        return noteMapper.toDTO(noteDAO.findById(id));
    }

    @Override
    public NoteDTO save(NoteDTO noteDTO) {
        return noteMapper.toDTO(noteDAO.save(noteMapper.toEntity(noteDTO)));
    }

    @Override
    public NoteDTO update(NoteDTO noteDTO) {
        return noteMapper.toDTO(noteDAO.save(noteMapper.toEntity(noteDTO)));
    }

    @Override
    public NoteDTO delete(NoteDTO noteDTO) {
        return noteMapper.toDTO(noteDAO.save(noteMapper.toEntity(noteDTO)));
    }

    @Override
    public List<NoteDTO> findAll() {
        return noteMapper.toDTOList(noteDAO.findAll())
                ;

    }

    @Override
    public NoteDTO registration(NoteDTO noteDTO) {
        return null;
    }
}
