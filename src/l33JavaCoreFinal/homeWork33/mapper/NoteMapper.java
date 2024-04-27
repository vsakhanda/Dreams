package l33JavaCoreFinal.homeWork33.mapper;

import l33JavaCoreFinal.homeWork33.dto.NoteDTO;
import l33JavaCoreFinal.homeWork33.entity.Note;

import java.util.List;
import java.util.stream.Collectors;

public class NoteMapper {


    public NoteDTO toDTO(Note note) {
        NoteDTO notesDTO = new NoteDTO();
        notesDTO.setId(note.getId());
        notesDTO.setName(note.getName());
        notesDTO.setText(note.getText());
        notesDTO.setAuthor(note.getAuthor());
 //       notesDTO.setDatetime(note.getDatetime());
        return notesDTO;
    }

    public Note toEntity(NoteDTO noteDTO){
        Note notes = new Note();
        notes.setId(noteDTO.getId());
        notes.setName(noteDTO.getName());
        notes.setText(noteDTO.getText());
        notes.setAuthor(noteDTO.getAuthor());
 //       notes.setDatetime(noteDTO.getDatetime());
        return notes;
    }

    public List<NoteDTO> toDTOList(List<Note> notes) {
        return notes.stream().map(
                this::toDTO
        ).collect(Collectors.toList());
    }

}
