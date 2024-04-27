package l33JavaCoreFinal.homeWork33.service;

import l33JavaCoreFinal.homeWork33.dto.NoteDTO;

import java.util.List;

public interface NoteService {

    NoteDTO findById(Integer id);

    NoteDTO save(NoteDTO noteDTO);

    NoteDTO update(NoteDTO noteDTO);

    NoteDTO delete(NoteDTO noteDTO);

    List<NoteDTO> findAll();

    NoteDTO registration(NoteDTO noteDTO);
}

